package com.mtsmda.hibenateOnly.hibenateOnly.model.inheritanceAndCustomMapping.tablePerConcreteClass;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class AudioDisc3 extends Disc3 {

	@Column(name = "audio_disc_trackCount")
	private int trackCount;

	@Column(name = "audio_disc_artist")
	private String artist;

	public AudioDisc3() {

	}

	public int getTrackCount() {
		return trackCount;
	}

	public void setTrackCount(int trackCount) {
		this.trackCount = trackCount;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((artist == null) ? 0 : artist.hashCode());
		result = prime * result + trackCount;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		AudioDisc3 other = (AudioDisc3) obj;
		if (artist == null) {
			if (other.artist != null)
				return false;
		} else if (!artist.equals(other.artist))
			return false;
		if (trackCount != other.trackCount)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AudioDisc [trackCount=" + trackCount + ", artist=" + artist + "]";
	}

}