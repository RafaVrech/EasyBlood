package easyblood.backend.repository;

import easyblood.backend.model.User;
import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
    User findByUsername(String username);
    User findById(ObjectId id);
}