import { JogoService } from './../../../services/jogo.service';
import { Component, OnInit } from '@angular/core';
import { Jogo } from 'src/app/model/jogo';

@Component({
  selector: 'app-modal-exclusao',
  templateUrl: './modal-exclusao.component.html',
  styleUrls: ['./modal-exclusao.component.css'],
})
export class ModalExclusaoComponent implements OnInit {
  jogoASerExcluido!: Jogo;

  constructor(private jogoService: JogoService) {}

  ngOnInit(): void {
    this.jogoService.jogoASerExcluido$.subscribe((jogo) => {
      this.jogoASerExcluido = jogo;
    });
  }

  public excluirJogo(){
    this.jogoService.deleteJogo(this.jogoASerExcluido.id);
  }
}
