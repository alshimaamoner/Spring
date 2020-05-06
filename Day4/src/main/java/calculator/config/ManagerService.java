package calculator.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerService {
    @Autowired
    private Manager manager;

    public void setManager(Manager manager) {
        this.manager = manager;
    }
    public Manager getManager() {
        return manager;
    }
}