import mongoose, { Schema } from "mongoose"

const pessoa = new Schema(
  {
    nome: {
      type: String,
      required: [true, "O nome da pessoa é obrigatório!"],
    },
    cpf: {
      type: String,
      required: [true, "O Cpf é obrigatório!"],
    },
    idade: {
      type: Number,
      min: [18, "A idade mínima é 18 anos!"],
    },
  },
);

var PessoaSchema = mongoose.model("Pessoa", pessoa);

export { PessoaSchema };