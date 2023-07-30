import { Jogo } from 'src/app/model/jogo';
import { JogoService } from './../../../services/jogo.service';
import { Component, Input, OnInit} from '@angular/core';

@Component({
  selector: 'app-cadastro',
  templateUrl: './cadastro.component.html',
  styleUrls: ['./cadastro.component.css'],
})
export class CadastroComponent implements OnInit{
  jogo: Jogo = new Jogo();

  constructor(private jogoService: JogoService) {}

  ngOnInit(): void {
  }

  saveJogo(){
    this.jogoService.postJogo(this.jogo).subscribe(resposta =>{
      resposta
    })
  }


}
