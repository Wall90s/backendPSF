import { Categoria } from "./categoria";

export class Jogo {
  public id!: number;
  public nome!: string;
  public descricao!: string;
  public preco!: number;
  public imagem!: string;
  public categoria!: Categoria;
  public esta_favoritado!: boolean;
}
