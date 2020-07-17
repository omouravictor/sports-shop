package Control.Managers;

import Model.EntitiesClasses.Client;
import Model.Tables.TbClientModel;
import View.CRUD.ClientCRUD;
import View.Forms.ClientForm;

public class ClientManager extends AbstractManager<Client> {

    private ClientForm clientForm;
    private TbClientModel tbClientModel;
    private ClientCRUD clientCRUD;

    public ClientManager() {
        clientForm = new ClientForm(null, true);
        tbClientModel = new TbClientModel(getAll(Client.class));
        clientCRUD = new ClientCRUD(null, true, this, tbClientModel);
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
    public Client update(Client client) throws Exception {
        // Sends the Exception to the view
        client = clientForm.update(client);
        if (client != null) {
            client = dao.updateInBank(client);
            return client;
        }
        return null;
    }

    @Override
    public void showCRUDscreen() {
        clientCRUD.setVisible(true);
    }

    public TbClientModel getTbClientModel() {
        return tbClientModel;
    }
}
