package cinema.service;

import cinema.model.Role;
import cinema.model.RoleName;

public interface RoleService {
    Role add(Role role);

    Role getByName(RoleName roleName);
}
