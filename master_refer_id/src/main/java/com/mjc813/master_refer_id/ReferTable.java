package com.mjc813.master_refer_id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
public class ReferTable {
    private Long id;
    private String name;
    private Long masterTableId;
    private MasterTable master;

    public ReferTable(Long id, String name, Long materTableId, MasterTable master) {
        this.id = id;
        this.name = name;
        this.masterTableId = materTableId;
        //this.master = master;
        if(master == null){
            this.master = new MasterTable();
        } else {
            this.master =new MasterTable(master.getId(), master.getName());
        }
    }


    public MasterTable getMaster() {
        return this.master;
    }

    public Long getMasterTableId() {
        return this.master.getId();
    }

    public void setMasterTableId(Long masterTableId) {
        this.masterTableId = masterTableId;
        if(this.master != null){
            this.master.setId(masterTableId);
        }
    }

    public void setMaster(MasterTable master) {
        this.master = new MasterTable(master.getId(), master.getName());
        this.masterTableId = master.getId();
    }
}
