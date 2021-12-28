package ibmtal.com.facebook.business.services;

import java.util.ArrayList;

import ibmtal.com.facebook.core.result.Result;
import ibmtal.com.facebook.entity.Page;

public interface PageService {
    ArrayList<Page> getAll();
    Page addPage(Page Page);
    Result newPage(Page page);
	Page addUser(Page Page);
}
