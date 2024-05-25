package adapter;

import cliente.ClientInterface;
import cliente.Cliente;
import proveedores.Alipay;

public class Adapter implements ClientInterface {
    @Override
    public void methodo(Cliente c, Alipay a) {
        a.setUser(c.getUsuario());
        a.setToken(c.getUsuario()+":"+a.getToken());

    }
}
