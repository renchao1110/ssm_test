package com.hl95.demo.entity;

public class Lower {
    private String epid;

    private String username;

    private String password;

    private String phone;

    private String message;

    private String linkid;

    private String subcode;

    private String state;

    private String type;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }



    public String getEpid() {
		return epid;
	}

	public void setEpid(String epid) {
		this.epid = epid;
	}

	public String getLinkid() {
		return linkid;
	}

	public void setLinkid(String linkid) {
		this.linkid = linkid;
	}

	public String getSubcode() {
		return subcode;
	}

	public void setSubcode(String subcode) {
		this.subcode = subcode;
	}

	public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}