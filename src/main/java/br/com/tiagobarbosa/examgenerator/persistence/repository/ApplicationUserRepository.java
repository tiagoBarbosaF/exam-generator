package br.com.tiagobarbosa.examgenerator.persistence.repository;

import br.com.tiagobarbosa.examgenerator.persistence.model.ApplicationUser;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ApplicationUserRepository extends PagingAndSortingRepository<ApplicationUser, Long> {
    ApplicationUser findByUsername(String username);
}
