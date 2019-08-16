package controladora;

public class PortaoFechando implements IPortao {

	@Override
	public ResultadoDeMovimentoPortao tratarTempo(final IPortao portao, final int posicaoPortao, final int posicaoMaximaPortao, final boolean portaoAbrindo) {
		// movimentando o portao
		final int novaPosicao = Math.max(posicaoPortao - 1, 0);
		boolean abrindo = portaoAbrindo;
		IPortao estadoPortao = portao;

		// verificando se o portao chegou no limite inferior
		if (posicaoPortao == 0) {
			// proximo movimento sera de abertura
			abrindo = true;
			estadoPortao = new PortaoParado();
		}

		return new ResultadoDeMovimentoPortao(abrindo, estadoPortao, novaPosicao);
	}

	@Override
	public ResultadoDeMovimentoPortao tratarBotao(final IPortao portao, final int posicaoPortao, final int posicaoMaximaPortao, final boolean portaoAbrindo) {
		return new ResultadoDeMovimentoPortao(false, new PortaoParado(), posicaoPortao);
	}

	@Override
	public ResultadoDeMovimentoPortao tratarObstaculo(final IPortao portao, final int posicaoPortao, final int posicaoMaximaPortao, final boolean portaoAbrindo) {
		// abrindo o portao
		return new ResultadoDeMovimentoPortao(portaoAbrindo, new PortaoAbrindo(), posicaoPortao);
	}

}
