/**
 * MainEntities.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.borland.sctm.ws.administration;

public interface MainEntities extends java.rmi.Remote {
    public com.borland.sctm.ws.administration.entities.Role[] getAllRoles(long sessionId) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public void setPassword(long sessionId, int userId, java.lang.String password) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.MissingValueException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.LoginException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public void encryptAndSetPassword(long sessionId, int userId, java.lang.String password) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.NotExistingValueException, com.borland.sctm.ws.administration.exceptions.MissingValueException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException, com.borland.sctm.ws.administration.exceptions.LoginException;
    public com.borland.sctm.ws.administration.entities.User[] getUsers(long sessionId, java.lang.String login) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public void updateUser(long sessionId, com.borland.sctm.ws.administration.entities.UserDetails userDetails) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.NotExistingValueException, com.borland.sctm.ws.administration.exceptions.MissingValueException, com.borland.sctm.ws.administration.exceptions.ExistingKeyException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.LoginException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public void deleteExecServer(long sessionId, int execServerId) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException, com.borland.sctm.ws.administration.exceptions.LoginException;
    public void updateExecServer(long sessionId, com.borland.sctm.ws.administration.entities.ExecServer execServer) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.NotExistingValueException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public void deactivateExecServer(long sessionId, int execServerId) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.LoginException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public void updateProject(long sessionId, com.borland.sctm.ws.administration.entities.Project project) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.NotExistingValueException, com.borland.sctm.ws.administration.exceptions.InvalidStateException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.LoginException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public com.borland.sctm.ws.administration.entities.Project[] getProjects(long sessionId) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public java.lang.String[] getProjectNames(long sessionId) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public java.lang.String[] getComponents(long sessionId, java.lang.String product) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public com.borland.sctm.ws.administration.entities.Location[] getLocations(long sessionId) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public java.lang.String[] getVersions(long sessionId, java.lang.String product) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public com.borland.sctm.ws.administration.entities.Project getProjectById(long sessionId, int projectId) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.NotExistingValueException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException, com.borland.sctm.ws.administration.exceptions.LoginException;
    public java.lang.String[] getBuilds(long sessionId, java.lang.String product, java.lang.String version) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public void updateUserGroup(long sessionId, com.borland.sctm.ws.administration.entities.UserGroup userGroup) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public void updateLocation(long sessionId, com.borland.sctm.ws.administration.entities.LocationDetails locationDetails) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.MissingValueException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException, com.borland.sctm.ws.administration.exceptions.LoginException;
    public java.lang.String[] getProducts(long sessionId) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public int createLocation(long sessionId, com.borland.sctm.ws.administration.entities.LocationDetails locationDetails) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.MissingValueException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException, com.borland.sctm.ws.administration.exceptions.LoginException;
    public int createExecServer(long sessionId, com.borland.sctm.ws.administration.entities.ExecServer execServer) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException, com.borland.sctm.ws.administration.exceptions.LoginException;
    public int createProject(long sessionId, com.borland.sctm.ws.administration.entities.Project project) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.LoginException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public com.borland.sctm.ws.administration.entities.Project[] getAllProjects(long sessionId, java.lang.String projectName) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public int createUser(long sessionId, com.borland.sctm.ws.administration.entities.UserDetails userDetails) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.ExistingKeyException, com.borland.sctm.ws.administration.exceptions.MissingValueException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException, com.borland.sctm.ws.administration.exceptions.LoginException;
    public java.lang.String[] getPlatforms(long sessionId) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public com.borland.sctm.ws.administration.entities.Project[] getProjectsForUser(long sessionId, int userId, int appModuleId) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public com.borland.sctm.ws.administration.entities.Location[] getLocationsForProject(long sessionId, int projectId) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public com.borland.sctm.ws.administration.entities.LocationDetails getLocationDetails(long sessionId, int locationId) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.NotExistingValueException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException, com.borland.sctm.ws.administration.exceptions.LoginException;
    public void deleteLocations(long sessionId, int[] locationIds) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.NotExistingValueException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException, com.borland.sctm.ws.administration.exceptions.LoginException;
    public void setProxyUsernameAndPasswordForLocation(long sessionId, int locationId, java.lang.String proxyUsername, java.lang.String proxyPassword) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.InvalidStateException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException, com.borland.sctm.ws.administration.exceptions.LoginException;
    public void deleteUsers(long sessionId, int[] userIdsToDelete) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.NotExistingValueException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException, com.borland.sctm.ws.administration.exceptions.LoginException;
    public com.borland.sctm.ws.administration.entities.UserDetails getUserDetails(long sessionId, int userId) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.NotExistingValueException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException, com.borland.sctm.ws.administration.exceptions.LoginException;
    public void deleteProjects(long sessionId, int[] projectIds) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.NotExistingValueException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.LoginException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public void activateProjects(long sessionId, int[] projectIds) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.LoginException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public void deactivateProjects(long sessionId, int[] projectIds) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.LoginException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public com.borland.sctm.ws.administration.entities.ExecServer getExecServerById(long sessionId, int execServerId) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.NotExistingValueException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public com.borland.sctm.ws.administration.entities.ExecServer[] getExecServersOfLocation(long sessionId, int locationId) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public void activateExecServer(long sessionId, int execServerId, int locationId) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.NotExistingValueException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.LoginException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public void removeResourceTag(long sessionId, int locationId, int execServerId, java.lang.String resourceTag) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.NotExistingValueException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.LoginException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public void addResourceTag(long sessionId, int locationId, int execServerId, java.lang.String resourceTag) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.NotExistingValueException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.LoginException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public java.lang.String[] getAllResourceTags(long sessionId, int locationId, int execServerId) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.NotExistingValueException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.LoginException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public boolean addLocationToProject(long sessionId, int projectId, int locationId) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.NotExistingValueException, com.borland.sctm.ws.administration.exceptions.InvalidStateException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException, com.borland.sctm.ws.administration.exceptions.LoginException;
    public boolean removeLocationFromProject(long sessionId, int projectId, int locationId) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.NotExistingValueException, com.borland.sctm.ws.administration.exceptions.InvalidStateException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.LoginException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public com.borland.sctm.ws.administration.entities.EssentialDescription[] getAllEssentials(long sessionId) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public com.borland.sctm.ws.administration.entities.EssentialGroup[] getEssentialGroups(long sessionId) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public com.borland.sctm.ws.administration.entities.EssentialSubGroup[] getEssentialSubGroups(long sessionId, int essentialGroupId) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public com.borland.sctm.ws.administration.entities.EssentialDescription[] getEssentials(long sessionId, int parentId) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public com.borland.sctm.ws.administration.entities.FilePoolEntry[] getFilePoolEntries(long sessionId, int projectId) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public int createUsergroup(long sessionId, com.borland.sctm.ws.administration.entities.UserGroup userGroup) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public com.borland.sctm.ws.administration.entities.UserGroup getGroupByName(long sessionId, java.lang.String groupName) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public com.borland.sctm.ws.administration.entities.UserGroup getGroupById(long sessionId, int groupId) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public com.borland.sctm.ws.administration.entities.UserGroup[] getAllUserGroups(long sessionId) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public void deleteUserGroup(long sessionId, int groupId) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public com.borland.sctm.ws.administration.entities.UserGroupMembership[] getMembershipsOfGroup(long sessionId, int groupId) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public com.borland.sctm.ws.administration.entities.UserGroupMembership[] getMembershipsOfUser(long sessionId, int userId) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public com.borland.sctm.ws.administration.entities.UserGroupMembership[] getAllMemberships(long sessionId) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public void updateMembershipsOfGroup(long sessionId, int groupId, com.borland.sctm.ws.administration.entities.UserGroupMembership[] memberships) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public void updateMembershipsOfUser(long sessionId, int userId, com.borland.sctm.ws.administration.entities.UserGroupMembership[] memberships) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public com.borland.sctm.ws.administration.entities.Role getRoleById(long sessionId, int roleId) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public java.lang.String getProductNameById(long sessionId, int productId) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public boolean addVersion(long sessionId, java.lang.String product, java.lang.String version, java.lang.String descr, boolean isActive) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public boolean addBuild(long sessionId, java.lang.String product, java.lang.String version, java.lang.String build, java.lang.String descr, boolean isActive) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public boolean isMixedModeAuthentication(long sessionId, int userId) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.NotExistingValueException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException;
    public void setMixedModeAuthentication(long sessionId, int userId, boolean useMixedMode) throws java.rmi.RemoteException, com.borland.sctm.ws.administration.exceptions.InvalidIdException, com.borland.sctm.ws.administration.exceptions.InternalException;
}