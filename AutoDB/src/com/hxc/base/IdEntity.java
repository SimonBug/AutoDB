package com.hxc.base;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Administrator on 2017/5/31 0031.
 */
@MappedSuperclass
public class IdEntity implements Serializable{
	private static final long serialVersionUID = -1375627697621272082L;
	@Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "ud")
    @TableGenerator(name = "ud",initialValue = 50,allocationSize = 1)
    protected Long id;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public int hashCode() {
        boolean prime = true;
        byte result = 1;
        int result1 = 31 * result + (this.id == null?0:this.id.hashCode());
        return result1;
    }

    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        } else if(obj == null) {
            return false;
        } else if(this.getClass() != obj.getClass()) {
            return false;
        } else {
            IdEntity other = (IdEntity)obj;
            if(this.id == null) {
                if(other.id != null) {
                    return false;
                }
            } else if(!this.id.equals(other.id)) {
                return false;
            }

            return true;
        }
    }

    
}
