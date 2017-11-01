package request.pojos;

import com.google.gson.annotations.SerializedName;

public class RepositoryRequest {
	private String name;
	private String description;
	private String homepage;

	@SerializedName("private")
	private boolean _private;

	private boolean has_issues;
	private boolean has_projects;

	private boolean has_wiki;

	private int team_id;

	private boolean auto_init;

	private String gitignore_template;
	private String license_template;
	private boolean allow_squash_merge;
	private boolean allow_merge_commit;
	private boolean allow_rebase_merge;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHomepage() {
		return homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public boolean is_private() {
		return _private;
	}

	public void set_private(boolean _private) {
		this._private = _private;
	}

	public boolean isHas_issues() {
		return has_issues;
	}

	public void setHas_issues(boolean has_issues) {
		this.has_issues = has_issues;
	}

	public boolean isHas_projects() {
		return has_projects;
	}

	public void setHas_projects(boolean has_projects) {
		this.has_projects = has_projects;
	}

	public boolean isHas_wiki() {
		return has_wiki;
	}

	public void setHas_wiki(boolean has_wiki) {
		this.has_wiki = has_wiki;
	}

	public int getTeam_id() {
		return team_id;
	}

	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}

	public boolean isAuto_init() {
		return auto_init;
	}

	public void setAuto_init(boolean auto_init) {
		this.auto_init = auto_init;
	}

	public String getGitignore_template() {
		return gitignore_template;
	}

	public void setGitignore_template(String gitignore_template) {
		this.gitignore_template = gitignore_template;
	}

	public String getLicense_template() {
		return license_template;
	}

	public void setLicense_template(String license_template) {
		this.license_template = license_template;
	}

	public boolean isAllow_squash_merge() {
		return allow_squash_merge;
	}

	public void setAllow_squash_merge(boolean allow_squash_merge) {
		this.allow_squash_merge = allow_squash_merge;
	}

	public boolean isAllow_merge_commit() {
		return allow_merge_commit;
	}

	public void setAllow_merge_commit(boolean allow_merge_commit) {
		this.allow_merge_commit = allow_merge_commit;
	}

	public boolean isAllow_rebase_merge() {
		return allow_rebase_merge;
	}

	public void setAllow_rebase_merge(boolean allow_rebase_merge) {
		this.allow_rebase_merge = allow_rebase_merge;
	}

}
