package Control.Managers;

import Model.EntitiesClasses.Client;
import View.Forms.ClientForm;
import java.util.List;

public class ClientManager extends AbstractManager<Client> {

    private ClientForm clientForm = new ClientForm(null, true);
    private List<Client> allClient = dao.getAllFromBank(Client.class);

    public ClientManager() {
    }

    @Override
    public Client create() throws Exception {
        // Sends the Exception to the view
        Client newClient = clientForm.create();
        if (newClient != null) {
            newClient = dao.createInBank(newClient);
            return newClient;
        }
        return null;
    }

    @Override
    public void read(Client client) throws Exception {
        // Sends the Exception to the view
        clientForm.read(client);
    }

    @Override
    public Client update(Client clientSelected) throws Exception {
        // Sends the Exception to the view
        Client updatedClient = clientForm.update(clientSelected);
        if (updatedClient != null) {
            updatedClient = dao.updateInBank(updatedClient);
            return updatedClient;
        }
        return null;
    }

    @Override
    public void delete(Client client) throws Exception {
        // Sends the Exception to the view
        dao.deleteInBank(client);
    }

    @Override
    public List<Client> getAll() {
        return dao.getAllFromBank(Client.class);
    }
}
