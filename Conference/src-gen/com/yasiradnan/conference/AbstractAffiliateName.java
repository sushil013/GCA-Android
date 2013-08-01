package com.yasiradnan.conference;

import com.yasiradnan.conference.DaoSession;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table ABSTRACT_AFFILIATE_NAME.
 */
public class AbstractAffiliateName {

    private long abstractsitemId;
    private long absaffiliationnameId;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient AbstractAffiliateNameDao myDao;

    private AbstractsItem abstractsItem;
    private Long abstractsItem__resolvedKey;

    private AbsAffiliationName absAffiliationName;
    private Long absAffiliationName__resolvedKey;


    public AbstractAffiliateName() {
    }

    public AbstractAffiliateName(long abstractsitemId, long absaffiliationnameId) {
        this.abstractsitemId = abstractsitemId;
        this.absaffiliationnameId = absaffiliationnameId;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getAbstractAffiliateNameDao() : null;
    }

    public long getAbstractsitemId() {
        return abstractsitemId;
    }

    public void setAbstractsitemId(long abstractsitemId) {
        this.abstractsitemId = abstractsitemId;
    }

    public long getAbsaffiliationnameId() {
        return absaffiliationnameId;
    }

    public void setAbsaffiliationnameId(long absaffiliationnameId) {
        this.absaffiliationnameId = absaffiliationnameId;
    }

    /** To-one relationship, resolved on first access. */
    public AbstractsItem getAbstractsItem() {
        if (abstractsItem__resolvedKey == null || !abstractsItem__resolvedKey.equals(abstractsitemId)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            AbstractsItemDao targetDao = daoSession.getAbstractsItemDao();
            abstractsItem = targetDao.load(abstractsitemId);
            abstractsItem__resolvedKey = abstractsitemId;
        }
        return abstractsItem;
    }

    public void setAbstractsItem(AbstractsItem abstractsItem) {
        if (abstractsItem == null) {
            throw new DaoException("To-one property 'abstractsitemId' has not-null constraint; cannot set to-one to null");
        }
        this.abstractsItem = abstractsItem;
        abstractsitemId = abstractsItem.getId();
        abstractsItem__resolvedKey = abstractsitemId;
    }

    /** To-one relationship, resolved on first access. */
    public AbsAffiliationName getAbsAffiliationName() {
        if (absAffiliationName__resolvedKey == null || !absAffiliationName__resolvedKey.equals(absaffiliationnameId)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            AbsAffiliationNameDao targetDao = daoSession.getAbsAffiliationNameDao();
            absAffiliationName = targetDao.load(absaffiliationnameId);
            absAffiliationName__resolvedKey = absaffiliationnameId;
        }
        return absAffiliationName;
    }

    public void setAbsAffiliationName(AbsAffiliationName absAffiliationName) {
        if (absAffiliationName == null) {
            throw new DaoException("To-one property 'absaffiliationnameId' has not-null constraint; cannot set to-one to null");
        }
        this.absAffiliationName = absAffiliationName;
        absaffiliationnameId = absAffiliationName.getId();
        absAffiliationName__resolvedKey = absaffiliationnameId;
    }

    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

}
