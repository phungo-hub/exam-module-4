package com.codegym.service;

import com.codegym.model.Branch;
import com.codegym.repository.BranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BranchService implements IBranchService{
    @Autowired
    private BranchRepository branchRepository;

    @Override
    public Iterable<Branch> findAll() {
        return branchRepository.findAll();
    }

    @Override
    public Optional<Branch> findById(Long id) {
        return branchRepository.findById(id);
    }

    @Override
    public void save(Branch Branch) {
        branchRepository.save(Branch);
    }

    @Override
    public void remove(Long id) {
        branchRepository.deleteById(id);
    }
}
