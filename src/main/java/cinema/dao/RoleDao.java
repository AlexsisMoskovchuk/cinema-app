package cinema.dao;

import cinema.model.Role;
import cinema.model.RoleName;
import java.util.Optional;

public interface RoleDao {
    Role add(Role role);

    Optional<Role> getByName(RoleName name);
}
