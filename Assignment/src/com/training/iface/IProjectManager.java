package com.training.iface;
import java.util.ArrayList;

import com.training.domains.*;
public interface IProjectManager {

	public boolean[] addProjects(Project...p);
	public ArrayList<Project> getProjectList();
	public Project getProjectDetail(Project p);
}
