import { Component, OnInit } from '@angular/core';
import { Jogo } from './model/jogo';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent implements OnInit{
  title = 'loja-games-front';

  jogos!: Jogo[];

  constructor(private httpClient: HttpClient) {
    // this.jogos = [];
    // this.jogos.push(
    //   new Jogo(
    //     1,
    //     'SOMA',
    //     'From the creators of Amnesia: The Dark Descent comes SOMA, a sci-fi horror game set below the waves of the Atlantic ocean. Struggle to survive a hostile world that will make you question your very existence.',
    //     88.99,
    //     'https://seugame.com/wp-content/uploads/2014/01/Soma-game.jpg'
    //   ),
    //   new Jogo(
    //     2,
    //     'FEZ',
    //     'Gomez is a 2D creature living in a 2D world. Or is he? When the existence of a mysterious 3rd dimension is revealed to him, Gomez is sent out on a journey that will take him to the very end of time and space. Use your ability to navigate 3D structures from 4 distinct classic 2D perspectives.',
    //     16.99,
    //     'https://apunkatorrents.net/wp-content/uploads/2019/11/Fez-cover-800x400.jpg'
    //   ),
    //   new Jogo(
    //     3,
    //     'Knockout City',
    //     'Team up and duke it out with rival Crews in Knockout City™, where EPIC DODGEBALL BATTLES settle the score in team-based multiplayer matches. Throw, catch, pass, dodge, and tackle your way to dodgeball dominance!',
    //     44.55,
    //     'https://xeratdragons.altervista.org/wp-content/uploads/2021/05/ExternalLink_Knockout-City-1-800x450.jpg'
    //   )
    // );
  }

  ngOnInit(): void {
    this.getJogos();
  }

  getJogos(){
    this.httpClient.get<Jogo[]>('http://localhost:8080/jogos').subscribe(
      resposta => {
        this.jogos = resposta
      });
  }

}
