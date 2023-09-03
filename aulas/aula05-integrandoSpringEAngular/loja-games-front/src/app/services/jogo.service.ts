import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Jogo } from '../model/jogo';
import { BehaviorSubject, Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class JogoService {
  apiUrl: string = 'http://localhost:8080/jogos';

  private jogoASerExcluidoSubject = new BehaviorSubject<any>(null);
  jogoASerExcluido$ = this.jogoASerExcluidoSubject.asObservable();

  constructor(private httpClient: HttpClient) {}

  public getJogos(): Observable<Jogo[]> {
    return this.httpClient.get<Jogo[]>(this.apiUrl);
  }

  public postJogo(novoJogo: Jogo): Observable<Jogo>{
    return this.httpClient.post<Jogo>(this.apiUrl, novoJogo);
  }

  public favoritarJogo(id: number): Observable<Jogo>{
    return this.httpClient.put<Jogo>(`${this.apiUrl}/favoritar/${id}`, null);
  }

  public setJogoASerExcluido(jogo: any){
    this.jogoASerExcluidoSubject.next(jogo);
  }

  public deleteJogo(id: number){
    this.httpClient.delete(`${this.apiUrl}/${id}`).subscribe();
    // window.location.reload();
  }

}
