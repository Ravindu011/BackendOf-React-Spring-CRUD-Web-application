package com.REACTandSpring.SpringBackend.Repository;

import com.REACTandSpring.SpringBackend.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {

}
