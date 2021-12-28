package ibmtal.com.facebook.database;

import org.springframework.data.jpa.repository.JpaRepository;

import ibmtal.com.facebook.entity.SharingLikes;

public interface SharingLikesDao extends JpaRepository<SharingLikes, Integer>{

}
