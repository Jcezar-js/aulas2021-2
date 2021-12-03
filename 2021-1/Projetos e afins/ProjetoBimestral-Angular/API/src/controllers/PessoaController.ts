import { Request, Response } from "express";
import { PessoaSchema } from "../models/PessoaSchema";

class PessoaController {

  // CADASTRAR
  async Cadastro(request: Request, response: Response) {
    try {
      const novoCadastro = await PessoaSchema.create(request.body);
      response.status(201).json({ data: novoCadastro, error: false, msg: "Pessoa cadastrada com sucesso!", });
    } catch (error) {
      response.status(400).json({
        data: error,
        error: true,
        msg: "Não foi possível cadastrar a Pessoa",
      });
    }
  }

  //LISTAR
  async listarPessoa(request: Request, response: Response) {
    try {
      const pessoa = await PessoaSchema.find();
      response.status(200).json({ data: pessoa, error: false, msg: "Pessoa encontrada!" });
    } catch (error) {
      response.status(404).json({ data: error, error: true, msg: "Pessoa não encontrada!" });
    }
  }
}

export { PessoaController };
