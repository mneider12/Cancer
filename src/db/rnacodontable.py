from sqlalchemy import create_engine, Column, Integer, String
from sqlalchemy.ext.declarative import declarative_base

Base = declarative_base()
engine = create_engine('sqlite:///:memory:', echo=True)

class Codon(Base):
    __tablename__ = 'codon'
    
    id = Column(String, primary_key=True)
    short_name = Column(String)
    long_name = Column(String)
    abbrev = Column(String)
    
    