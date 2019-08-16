package controladora;

public interface IPortao {

	default ResultadoDeMovimentoPortao tratarTempo(final IPortao portao, final int posicaoPortao, final int posicaoMaximaPortao, final boolean portaoAbrindo) {
		return new ResultadoDeMovimentoPortao(portaoAbrindo, portao, posicaoPortao);
	}

	ResultadoDeMovimentoPortao tratarBotao(final IPortao portao, final int posicaoPortao, final int posicaoMaximaPortao, final boolean portaoAbrindo);

	default ResultadoDeMovimentoPortao tratarObstaculo(final IPortao portao, final int posicaoPortao, final int posicaoMaximaPortao, final boolean portaoAbrindo) {
		return new ResultadoDeMovimentoPortao(portaoAbrindo, portao, posicaoPortao);
	}
}
