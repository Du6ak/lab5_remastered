package lab5.service;

import lab5.entity.Kurator;

public interface KuratorService extends Service<Kurator> {

    Kurator readByName(String name);

    Kurator readByphone(String name);

}
