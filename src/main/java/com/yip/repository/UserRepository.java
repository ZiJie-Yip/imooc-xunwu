package com.yip.repository;

import com.yip.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @Title: UserRepository
 * @author: Vincent.Yip
 * @Description: TODO
 * @date 2019/5/5 16:16
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
