package ibmtal.com.facebook.business.manager;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibmtal.com.facebook.business.services.SharingLikesService;
import ibmtal.com.facebook.core.result.Message;
import ibmtal.com.facebook.core.result.Result;
import ibmtal.com.facebook.database.SharingLikesDao;
import ibmtal.com.facebook.database.UserDao;
import ibmtal.com.facebook.entity.Sharing;
import ibmtal.com.facebook.entity.SharingLikes;
import ibmtal.com.facebook.entity.User;
import ibmtal.com.facebook.entity.dto.SharingLikesDto;

@Service
public class SharingLikesManager implements SharingLikesService {
	private SharingLikesDao sharingLikesDao;
	private UserDao userDao;

	@Autowired
	public SharingLikesManager(SharingLikesDao sharingLikesDao, UserDao userDao) {
		super();
		this.sharingLikesDao = sharingLikesDao;
		this.userDao = userDao;
	}

	@Override
	public Result addSharingLikes(SharingLikesDto sharingLikesDto) {
		Result result = new Result();
		ArrayList<Message> mesaj = new ArrayList<Message>();
		result.setSuccess(true);

		SharingLikes sharingLikes = new SharingLikes();
		sharingLikes.setSharingid(sharingLikesDto.getSharingid());
		sharingLikes.setLiketime(sharingLikesDto.getLiketime());

		User user = new User();
		user = this.userDao.findById(sharingLikesDto.getUserid()).get();
		sharingLikes.setUser(user);
		sharingLikesDao.save(sharingLikes);
		return result;
	}

	@Override
	public ArrayList<SharingLikes> getall() {
		// TODO Auto-generated method stub
		return new ArrayList<SharingLikes>(this.sharingLikesDao.findAll());
	}
}
