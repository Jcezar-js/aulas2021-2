import { Router } from "express";
import { PessoaController } from "../controllers/PessoaController";

const router = Router();
const pessoaController = new PessoaController();

// rotas para registrar
router.post("/cadastrar/pessoas", pessoaController.Cadastro);

// rotas para listagem
router.get("/listar/pessoas", pessoaController.listarPessoa);

export { router };
