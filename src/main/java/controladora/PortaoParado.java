package controladora;

public class PortaoParado implements IPortao {

	@Override
	public ResultadoDeMovimentoPortao tratarBotao(final IPortao portao, final int posicaoPortao, final int posicaoMaximaPortao, final boolean portaoAbrindo) {
		// movimentar o portao quando o botao for pressionado
		if (portaoAbrindo) {
			return new ResultadoDeMovimentoPortao(true, new PortaoAbrindo(), posicaoPortao);
		} else {
			return new ResultadoDeMovimentoPortao(false, new PortaoFechando(), posicaoPortao);
		}

	}

}
