/*
 * package com.shw.cl.service.impl;
 * 
 * package com.shw.cl.service.impl;
 * 
 * import java.util.List;
 * 
 * import javax.transaction.Transactional;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service;
 * 
 * import com.shw.cl.integrator.dao.InterfaceDao; import
 * com.shw.cl.integrator.entity.Interface; import
 * com.shw.cl.integrator.model.InterfaceRequest; import
 * com.shw.cl.integrator.model.InterfaceResponse; import
 * com.shw.cl.integrator.repository.InterfaceRepository; import
 * com.shw.cl.integrator.service.InterfaceService;
 * 
 * @Service public class InterfaceServiceImpl implements InterfaceService{
 * 
 * @Autowired InterfaceRepository interfaceRepository;
 * 
 * @Autowired InterfaceDao interfaceDao;
 * 
 * @Override public List<Interface> getInterfaces() { // TODO Auto-generated
 * method stub return interfaceRepository.getInterface(); }
 * 
 * @Override public void createInterface(InterfaceRequest interfaceRequest) { //
 * TODO Auto-generated method stub
 * interfaceDao.createInterface(interfaceRequest); }
 * 
 * @Override public void updateInterface(InterfaceRequest interfaceRequest) { //
 * TODO Auto-generated method stub
 * interfaceDao.updateInterface(interfaceRequest); //return
 * interfaceRepository.updateInterface(null, null);
 * 
 * }
 * 
 * @Override public void deleteInterface(Integer id) { // TODO Auto-generated
 * method stub interfaceDao.deleteInterface(id); }
 * 
 * }
 */