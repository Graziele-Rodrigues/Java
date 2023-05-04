package principal;

public class IntergerSet {
    private static final int TAMANHO = 101;

    private boolean array[];

    public IntergerSet() {
        this.array = new boolean[TAMANHO];
    }

    private IntergerSet(boolean values[]) {
        this.array = values;
    }

    // retorna a intersecção deste Set com outro
    public IntergerSet intersecction(IntergerSet outro) {
        boolean intersect[] = new boolean[TAMANHO];
        for (int i = 0; i < TAMANHO; i++) {
            intersect[i] = this.array[i] && outro.array[i];
        }
        return new IntergerSet(intersect);
    }

    // retorna a união deste Set com outro
    public IntergerSet union(IntergerSet outro) {
        boolean un[] = new boolean[TAMANHO];
        for (int i = 0; i < TAMANHO; i++) {
            un[i] = this.array[i] || outro.array[i];
        }
        return new IntergerSet(un);
    }

    public void insertElement(int pos) {
        this.array[pos] = true;
    }

    public void deletElement(int pos) {
        this.array[pos] = false;
    }

    public String toSetString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < TAMANHO; i++) {
            if (this.array[i]) { // número i pertence ao set
                if (sb.length() == 0) {
                    sb.append(i);
                } else {
                    sb.append(" ").append(i);
                }
            }
        }
        return sb.length() == 0 ? "--" : sb.toString();
    }

    // verifica se este set é igual a outro
    public boolean isEqualsTo(IntergerSet outro) {
        for (int i = 0; i < TAMANHO; i++) {
            if (this.array[i] != outro.array[i]) {
                // achei um elemento diferente, os sets não são iguais
                return false;
            }
        }
        return true;
    }
}
