package pack;

import pack.interfaces.Orinar;

public class OrinarEspartanoImpl implements Orinar {
    @Override
    public String orinar(String nombre) {
        return "El espartano "+nombre+" se orina";
    }
}
