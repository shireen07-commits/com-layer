/*
 * package com.shw.cl.dao;
 * 
 * package com.shw.cl.dao;
 * 
 * import java.util.Optional;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.http.HttpStatus; import
 * org.springframework.stereotype.Repository; import
 * org.springframework.util.ObjectUtils; import
 * org.springframework.web.server.ResponseStatusException;
 * 
 * 
 * 
 * @Repository public class InterfaceDao {
 * 
 * @Autowired InterfaceRepository interfaceRepository;
 * 
 * public void createInterface(InterfaceRequest interfaceRequest) { Interface
 * interfaces = new Interface();
 * 
 * if (!((Optional.ofNullable(interfaceRequest).map(InterfaceRequest::
 * getInterfaceid).isPresent()) && interfaceRequest.getInterfaceid() != 0)) {
 * 
 * interfaces.setInterfaceid(interfaceRequest.getInterfaceid());
 * interfaces.setInterfacename(interfaceRequest.getInterfacename());
 * interfaces.setInterfacedescription(interfaceRequest.getInterfacedescription()
 * ); interfaces.setIsactive(true); interfaceRepository.save(interfaces); } else
 * { throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
 * "Interface already exists"); }
 * 
 * }
 * 
 * public void updateInterface(InterfaceRequest interfaceRequest) { Interface
 * interfaces = new Interface();
 * 
 * if
 * ((Optional.ofNullable(interfaceRequest).map(InterfaceRequest::getInterfaceid)
 * .isPresent()) && interfaceRequest.getInterfaceid() != 0) {
 * 
 * interfaces.setInterfaceid(interfaceRequest.getInterfaceid());
 * interfaces.setInterfacename(interfaceRequest.getInterfacename());
 * interfaces.setInterfacedescription(interfaceRequest.getInterfacedescription()
 * ); interfaces.setIsactive(true); interfaceRepository.save(interfaces); ; }
 * else { throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
 * "Interface not exists"); }
 * 
 * }
 * 
 * public void deleteInterface(Integer id) { Interface interfaces =
 * interfaceRepository.findById(id).get(); if (!(ObjectUtils.isEmpty(id) && id >
 * 0)) { interfaces.setIsactive(false); interfaceRepository.save(interfaces); }
 * else { throw new ResponseStatusException(HttpStatus.NOT_FOUND,
 * "Data Not Found"); }
 * 
 * } }
 */