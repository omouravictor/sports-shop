package Control;

import Model.Entities.Client;
import View.Forms.ClientForm;

public class ClientControl {

    private ClientForm clientForm = new ClientForm(null, true);

    public ClientControl() {
    }

    public Client create() {
        Client newClient = clientForm.create();
        return newClient;
    }

    public void read(Client client) {
        clientForm.read(client);
    }

    public Client update(Client client) {
        Client updatedClient = clientForm.update(client);
        return updatedClient;
    }

    public boolean delete(Client client) {
        return client != null;
    }
}
