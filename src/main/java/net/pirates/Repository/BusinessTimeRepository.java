package net.pirates.Repository;

import net.pirates.Domain.BusinessTime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusinessTimeRepository extends JpaRepository<BusinessTime, Long> {
}
