package ibmtal.com.facebook.api;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ibmtal.com.facebook.business.services.SharingLikesService;
import ibmtal.com.facebook.core.result.Result;
import ibmtal.com.facebook.entity.SharingLikes;
import ibmtal.com.facebook.entity.dto.SharingLikesDto;

@RestController
@RequestMapping("/api/sharinglikes")
public class SharingLikesController {
    private SharingLikesService sharingLikesService;
    @Autowired
    public SharingLikesController(SharingLikesService sharingLikesService) {
    	super();
    	this.sharingLikesService = sharingLikesService;  
	}
    @PostMapping("/newSharingLikes")
    public Result newSharingLikes(@RequestBody SharingLikesDto sharingLikesDto) {
    	
    	return sharingLikesService.addSharingLikes(sharingLikesDto);
    }
    @GetMapping("/getall")
    public ArrayList<SharingLikes> getall(){
    	return new ArrayList<SharingLikes>(this.sharingLikesService.getall());
    }
}
