package com.example.denislaptiev.service.inter;

import com.example.denislaptiev.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService   extends CrudService<User,Long>{
}
