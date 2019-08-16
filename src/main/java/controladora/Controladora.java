package controladora;

public class Controladora {
	final private static int POSICAO_MAXIMA_PORTAO = 5;

	public String executar(String entrada) {
		StringBuilder saida = new StringBuilder();
		IPortao portao = new PortaoParado();
		int posicaoPortao = 0;
		boolean portaoAbrindo = true;

		for (int i = 0; i < entrada.length(); i++) {
			ResultadoDeMovimentoPortao resultadoDeMovimentoPortao;
			switch (entrada.charAt(i)) {
				case '.':                        // NADA A FAZER
					resultadoDeMovimentoPortao = portao.tratarTempo(portao, posicaoPortao, POSICAO_MAXIMA_PORTAO, portaoAbrindo);
					portaoAbrindo = resultadoDeMovimentoPortao.isAbrindo();
					posicaoPortao = resultadoDeMovimentoPortao.getPosicao();
					portao = resultadoDeMovimentoPortao.getEstadoPortao();
					break;

				case 'P':                        // BOTAO PRESSIONADO
					resultadoDeMovimentoPortao = portao.tratarBotao(portao, posicaoPortao, POSICAO_MAXIMA_PORTAO, portaoAbrindo);
					portaoAbrindo = resultadoDeMovimentoPortao.isAbrindo();
					posicaoPortao = resultadoDeMovimentoPortao.getPosicao();
					portao = resultadoDeMovimentoPortao.getEstadoPortao();

					resultadoDeMovimentoPortao = portao.tratarTempo(portao, posicaoPortao, POSICAO_MAXIMA_PORTAO, portaoAbrindo);
					portaoAbrindo = resultadoDeMovimentoPortao.isAbrindo();
					posicaoPortao = resultadoDeMovimentoPortao.getPosicao();
					portao = resultadoDeMovimentoPortao.getEstadoPortao();
					break;

				case 'O':                        // OBSTACULO
					resultadoDeMovimentoPortao = portao.tratarObstaculo(portao, posicaoPortao, POSICAO_MAXIMA_PORTAO, portaoAbrindo);
					portaoAbrindo = resultadoDeMovimentoPortao.isAbrindo();
					posicaoPortao = resultadoDeMovimentoPortao.getPosicao();
					portao = resultadoDeMovimentoPortao.getEstadoPortao();

					resultadoDeMovimentoPortao = portao.tratarTempo(portao, posicaoPortao, POSICAO_MAXIMA_PORTAO, portaoAbrindo);
					portaoAbrindo = resultadoDeMovimentoPortao.isAbrindo();
					posicaoPortao = resultadoDeMovimentoPortao.getPosicao();
					portao = resultadoDeMovimentoPortao.getEstadoPortao();
					break;
			}


			saida.append(posicaoPortao);
		}

		return saida.toString();
	}


}
