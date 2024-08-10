package com.leadmanagementsystem.entities;

import java.util.Objects;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.TableGenerator;

@Entity
public class Source {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "table-generator")
	@TableGenerator(name = "table-generator", table = "source_ids", pkColumnName = "seq_id", valueColumnName = "seq_value")
	private Long sourceId;

	private String sourceName;

	private String sourceDetails;

	private Long userId;

	public Source() {

	}

	public Source(Long sourceId, String sourceName, String sourceDetails) {
		super();
		this.sourceId = sourceId;
		this.sourceName = sourceName;
		this.sourceDetails = sourceDetails;
	}

	public Source(Long sourceId, String sourceName, String sourceDetails, Long userId) {
		super();
		this.sourceId = sourceId;
		this.sourceName = sourceName;
		this.sourceDetails = sourceDetails;
		this.userId = userId;
	}

	public Long getSourceId() {
		return sourceId;
	}

	public void setSourceId(Long sourceId) {
		this.sourceId = sourceId;
	}

	public String getSourceName() {
		return sourceName;
	}

	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public String getSourceDetails() {
		return sourceDetails;
	}

	public void setSourceDetails(String sourceDetails) {
		this.sourceDetails = sourceDetails;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Source [sourseId=" + sourceId + ", sourceName=" + sourceName + ", sourceDetails=" + sourceDetails
				+ ", userId=" + userId + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(sourceDetails, sourceId, sourceName, userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Source other = (Source) obj;
		return Objects.equals(sourceDetails, other.sourceDetails) && Objects.equals(sourceId, other.sourceId)
				&& Objects.equals(sourceName, other.sourceName) && Objects.equals(userId, other.userId);
	}

}
