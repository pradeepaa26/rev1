package com.courses.module.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="courses")
public class Course {
	@Id
	@Column(name="`id`")
	private int id;
	@Column(name="`name`")
	private String name;
	@OneToOne
	@JoinColumn(name="`level_id`")
	private Levels levels;
	@OneToOne
	@JoinColumn(name="`category_id`")
	private Categories categories;
	
	@OneToMany
	@JoinColumn(name="`id`")
	private List<CourseSubscribedVideos> CourseSubscribedVideoObj;
	
	public List<CourseSubscribedVideos> getCourseSubscribedVideoObj() {
		return CourseSubscribedVideoObj;
	}
	public void setCourseSubscribedVideoObj(List<CourseSubscribedVideos> courseSubscribedVideoObj) {
		CourseSubscribedVideoObj = courseSubscribedVideoObj;
	}
	public List<CourseSubscribedTexts> getCourseSubscribedTextObj() {
		return CourseSubscribedTextObj;
	}
	public void setCourseSubscribedTextObj(List<CourseSubscribedTexts> courseSubscribedTextObj) {
		CourseSubscribedTextObj = courseSubscribedTextObj;
	}
	@OneToMany
	@JoinColumn(name="`id`")
	private List<CourseSubscribedTexts> CourseSubscribedTextObj;
	
	@Column(name="`tag`")
	private String tag;
	@Column(name="`slug`")
	private String slug;
	@Column(name="`is_level_override`")
	private boolean isLevelOverride;
	@Column(name="`available_for`")
	private boolean available_for;
	@Column(name="`description`")
	private String description;
	@Column(name="`meta_key`")
	private String meta_key;
	@Column(name="`meta_desc`")
	private String meta_desc;
	@Column(name="`created_by`")
	private String created_by;
	@Column(name="`modified_by`")
	private String modified_by;
	@Column(name="`created_on`")
	private Date created_on;
	@Column(name="`modified_on`")
	private Date modified_on;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Levels getLevels() {
		return levels;
	}
	public void setLevels(Levels levels) {
		this.levels = levels;
	}
	public Categories getCategories() {
		return categories;
	}
	public void setCategories(Categories categories) {
		this.categories = categories;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getSlug() {
		return slug;
	}
	public void setSlug(String slug) {
		this.slug = slug;
	}

	public boolean isLevelOverride() {
		return isLevelOverride;
	}
	public void setLevelOverride(boolean isLevelOverride) {
		this.isLevelOverride = isLevelOverride;
	}
	public boolean isAvailable_for() {
		return available_for;
	}
	public void setAvailable_for(boolean available_for) {
		this.available_for = available_for;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMeta_key() {
		return meta_key;
	}
	public void setMeta_key(String meta_key) {
		this.meta_key = meta_key;
	}
	public String getMeta_desc() {
		return meta_desc;
	}
	public void setMeta_desc(String meta_desc) {
		this.meta_desc = meta_desc;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public String getModified_by() {
		return modified_by;
	}
	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}
	public Date getCreated_on() {
		return created_on;
	}
	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}
	public Date getModified_on() {
		return modified_on;
	}
	public void setModified_on(Date modified_on) {
		this.modified_on = modified_on;
	}
	
	
}
