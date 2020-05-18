package com.youcode.Services;

import java.util.List;
import java.util.Optional;

import com.youcode.Entiter.ImageProduit;

public interface IimageProduitSRV {
	public void addOrUpdateImageProduit( ImageProduit imageProduit);
	public Optional<ImageProduit> selectByIdImageProduit(int id);
	public List<ImageProduit> selectAllImageProduit();
	public void deleteImageProduit(int id);

}
