import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Jogo } from '../model/jogo';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class JogoService {
  apiUrl: string = 'http://localhost:8080/jogos';

  constructor(private httpClient: HttpClient) {}

  public getJogos(): Observable<Jogo[]> {
    return this.httpClient.get<Jogo[]>(this.apiUrl);
  }

  public postJogo(novoJogo: Jogo): Observable<Jogo>{
    return this.httpClient.post<Jogo>(this.apiUrl, novoJogo);
  }
}
