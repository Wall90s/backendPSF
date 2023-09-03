import { JogoService } from './../../../services/jogo.service';
import { Component, Input, OnInit } from '@angular/core';
import { faHeart, faCircleXmark } from '@fortawesome/free-solid-svg-icons';
import { Jogo } from 'src/app/model/jogo';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css'],
})
export class CardComponent implements OnInit {


  @Input() jogo!: Jogo;
  faHeart = faHeart;
  faCircleXmark = faCircleXmark;
  mouseOver:boolean = false;

  constructor(private jogoService: JogoService) {}

  ngOnInit(): void {
  }

  public onClickBotaoExcluir(){
    this.jogoService.setJogoASerExcluido(this.jogo);
  }

  public favoritarJogo() {
    this.jogoService.favoritarJogo(this.jogo.id).subscribe();
    this.jogo.esta_favoritado = !this.jogo.esta_favoritado;
  }
}
