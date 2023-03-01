public class Motor {
    private String motor;
    private String combustivel;
    private String cambio;
    private String aceleracao;

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public String getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(String aceleracao) {
        this.aceleracao = aceleracao;
    }
    public void cadastrarMotor(String motor) {
        setMotor(motor);
    }
}
