import { JogoService } from './../../../services/jogo.service';
import { Component, Input } from '@angular/core';
import { faHeart } from '@fortawesome/free-solid-svg-icons';
import { Jogo } from 'src/app/model/jogo';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css'],
})
export class CardComponent {
  @Input() jogo!: Jogo;
  faHeart = faHeart;

  constructor(private jogoService: JogoService) {}

  public favoritarJogo() {
    this.jogoService.favoritarJogo(this.jogo.id).subscribe();
    this.jogo.esta_favoritado = !this.jogo.esta_favoritado;
  }
}
