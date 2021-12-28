package ibmtal.com.facebook.business.services;

import java.util.ArrayList;

import ibmtal.com.facebook.core.result.Result;
import ibmtal.com.facebook.entity.SharingLikes;
import ibmtal.com.facebook.entity.dto.SharingLikesDto;

public interface SharingLikesService {
    Result addSharingLikes(SharingLikesDto sharingLikesDto);
    ArrayList<SharingLikes> getall();
}
