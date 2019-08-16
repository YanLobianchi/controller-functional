package controladora;

public class ResultadoDeMovimentoPortao {
	final private boolean abrindo;
	final private IPortao estadoPortao;
	final private int posicao;

	ResultadoDeMovimentoPortao(final boolean abrindo, final IPortao estadoPortao, final int posicao) {
		this.abrindo = abrindo;
		this.estadoPortao = estadoPortao;
		this.posicao = posicao;
	}

	public int getPosicao() {
		return posicao;
	}

	public boolean isAbrindo() {
		return abrindo;
	}

	public IPortao getEstadoPortao() {
		return estadoPortao;
	}
}
