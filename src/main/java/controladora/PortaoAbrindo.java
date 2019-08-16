package controladora;

public class PortaoAbrindo implements IPortao {

	@Override
	public ResultadoDeMovimentoPortao tratarTempo(final IPortao portao, final int posicaoPortao, final int posicaoMaximaPortao, final boolean portaoAbrindo) {
		// movimentando o portao 
		final int novaPosicao = Math.min(posicaoPortao + 1, posicaoMaximaPortao);
		boolean abrindo = portaoAbrindo;
		IPortao estadoPortao = portao;

		if (posicaoPortao >= posicaoMaximaPortao) {
			// proximo movimento sera de fechamento
			abrindo = false;
			estadoPortao = new PortaoParado();
		}
		return new ResultadoDeMovimentoPortao(abrindo, estadoPortao, novaPosicao);
	}

	@Override
	public ResultadoDeMovimentoPortao tratarBotao(final IPortao portao, final int posicaoPortao, final int posicaoMaximaPortao, final boolean portaoAbrindo) {
		return new ResultadoDeMovimentoPortao(true, new PortaoParado(), posicaoPortao);
	}

	@Override
	public ResultadoDeMovimentoPortao tratarObstaculo(final IPortao portao, final int posicaoPortao, final int posicaoMaximaPortao, final boolean portaoAbrindo) {
		// fechando o portao
		return new ResultadoDeMovimentoPortao(portaoAbrindo, new PortaoFechando(), posicaoPortao);
	}

}
