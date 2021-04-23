package violation;
import java.time.LocalDateTime;

public class InternetSession {
	private LocalDateTime begin;
	private Long subscriberId;
	private Long dataUsed;
	
	public InternetSession(LocalDateTime begin, Long subscriberId, Long dataUsed) {
		super();
		this.begin = begin;
		this.subscriberId = subscriberId;
		this.dataUsed = dataUsed;
	}

	public LocalDateTime getBegin() {
		return begin;
	}

	public void setBegin(LocalDateTime begin) {
		this.begin = begin;
	}

	public Long getSubscriberId() {
		return subscriberId;
	}

	public void setSubscriberId(Long subscriberId) {
		this.subscriberId = subscriberId;
	}

	public Long getDataUsed() {
		return dataUsed;
	}

	public void setDataUsed(Long dataUsed) {
		this.dataUsed = dataUsed;
	}
	
	
}
