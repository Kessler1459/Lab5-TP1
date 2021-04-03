package pack;

import pack.interfaces.Orinar;

public class OrinarVikingoImpl implements Orinar {
    @Override
    public String orinar(String nombre) {
        return "El vikingo "+nombre+" se orina";
    }
}
